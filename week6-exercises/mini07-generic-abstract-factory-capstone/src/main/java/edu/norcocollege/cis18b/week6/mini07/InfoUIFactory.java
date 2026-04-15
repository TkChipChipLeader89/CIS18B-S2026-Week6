package edu.norcocollege.cis18b.week6.mini07;

//InfoUIFactory class
public class InfoUIFactory implements UIFactory<InfoButton, InfoDialog> {
    public InfoButton createButton() {
        return new InfoButton();
    }

    public InfoDialog createDialog() {
        return new InfoDialog();
    }
}