package javax.swing.plaf.multi;

import java.awt.Dimension;
import java.awt.Graphics;
import java.util.Vector;
import javax.accessibility.Accessible;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.plaf.ComboBoxUI;
import javax.swing.plaf.ComponentUI;

public class MultiComboBoxUI
  extends ComboBoxUI
{
  protected Vector uis = new Vector();
  
  public MultiComboBoxUI() {}
  
  public ComponentUI[] getUIs()
  {
    return MultiLookAndFeel.uisToArray(this.uis);
  }
  
  public boolean isFocusTraversable(JComboBox paramJComboBox)
  {
    boolean bool = ((ComboBoxUI)this.uis.elementAt(0)).isFocusTraversable(paramJComboBox);
    for (int i = 1; i < this.uis.size(); i++) {
      ((ComboBoxUI)this.uis.elementAt(i)).isFocusTraversable(paramJComboBox);
    }
    return bool;
  }
  
  public void setPopupVisible(JComboBox paramJComboBox, boolean paramBoolean)
  {
    for (int i = 0; i < this.uis.size(); i++) {
      ((ComboBoxUI)this.uis.elementAt(i)).setPopupVisible(paramJComboBox, paramBoolean);
    }
  }
  
  public boolean isPopupVisible(JComboBox paramJComboBox)
  {
    boolean bool = ((ComboBoxUI)this.uis.elementAt(0)).isPopupVisible(paramJComboBox);
    for (int i = 1; i < this.uis.size(); i++) {
      ((ComboBoxUI)this.uis.elementAt(i)).isPopupVisible(paramJComboBox);
    }
    return bool;
  }
  
  public boolean contains(JComponent paramJComponent, int paramInt1, int paramInt2)
  {
    boolean bool = ((ComponentUI)this.uis.elementAt(0)).contains(paramJComponent, paramInt1, paramInt2);
    for (int i = 1; i < this.uis.size(); i++) {
      ((ComponentUI)this.uis.elementAt(i)).contains(paramJComponent, paramInt1, paramInt2);
    }
    return bool;
  }
  
  public void update(Graphics paramGraphics, JComponent paramJComponent)
  {
    for (int i = 0; i < this.uis.size(); i++) {
      ((ComponentUI)this.uis.elementAt(i)).update(paramGraphics, paramJComponent);
    }
  }
  
  public static ComponentUI createUI(JComponent paramJComponent)
  {
    MultiComboBoxUI localMultiComboBoxUI = new MultiComboBoxUI();
    return MultiLookAndFeel.createUIs(localMultiComboBoxUI, ((MultiComboBoxUI)localMultiComboBoxUI).uis, paramJComponent);
  }
  
  public void installUI(JComponent paramJComponent)
  {
    for (int i = 0; i < this.uis.size(); i++) {
      ((ComponentUI)this.uis.elementAt(i)).installUI(paramJComponent);
    }
  }
  
  public void uninstallUI(JComponent paramJComponent)
  {
    for (int i = 0; i < this.uis.size(); i++) {
      ((ComponentUI)this.uis.elementAt(i)).uninstallUI(paramJComponent);
    }
  }
  
  public void paint(Graphics paramGraphics, JComponent paramJComponent)
  {
    for (int i = 0; i < this.uis.size(); i++) {
      ((ComponentUI)this.uis.elementAt(i)).paint(paramGraphics, paramJComponent);
    }
  }
  
  public Dimension getPreferredSize(JComponent paramJComponent)
  {
    Dimension localDimension = ((ComponentUI)this.uis.elementAt(0)).getPreferredSize(paramJComponent);
    for (int i = 1; i < this.uis.size(); i++) {
      ((ComponentUI)this.uis.elementAt(i)).getPreferredSize(paramJComponent);
    }
    return localDimension;
  }
  
  public Dimension getMinimumSize(JComponent paramJComponent)
  {
    Dimension localDimension = ((ComponentUI)this.uis.elementAt(0)).getMinimumSize(paramJComponent);
    for (int i = 1; i < this.uis.size(); i++) {
      ((ComponentUI)this.uis.elementAt(i)).getMinimumSize(paramJComponent);
    }
    return localDimension;
  }
  
  public Dimension getMaximumSize(JComponent paramJComponent)
  {
    Dimension localDimension = ((ComponentUI)this.uis.elementAt(0)).getMaximumSize(paramJComponent);
    for (int i = 1; i < this.uis.size(); i++) {
      ((ComponentUI)this.uis.elementAt(i)).getMaximumSize(paramJComponent);
    }
    return localDimension;
  }
  
  public int getAccessibleChildrenCount(JComponent paramJComponent)
  {
    int i = ((ComponentUI)this.uis.elementAt(0)).getAccessibleChildrenCount(paramJComponent);
    for (int j = 1; j < this.uis.size(); j++) {
      ((ComponentUI)this.uis.elementAt(j)).getAccessibleChildrenCount(paramJComponent);
    }
    return i;
  }
  
  public Accessible getAccessibleChild(JComponent paramJComponent, int paramInt)
  {
    Accessible localAccessible = ((ComponentUI)this.uis.elementAt(0)).getAccessibleChild(paramJComponent, paramInt);
    for (int i = 1; i < this.uis.size(); i++) {
      ((ComponentUI)this.uis.elementAt(i)).getAccessibleChild(paramJComponent, paramInt);
    }
    return localAccessible;
  }
}
