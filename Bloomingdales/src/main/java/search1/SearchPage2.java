package search1;

import base.CommonAPI2;

public class SearchPage2 extends CommonAPI2 {

    public void searchMenu2(){

        typeOnElement("keyword", "Boots");
        navigateBack();
        typeOnElement("keyword", "Bottoms");
        navigateBack();
        typeOnElement("keyword", "kids");
        navigateBack();
        typeOnElement("keyword", "Jewelry");
        navigateBack();
        typeOnElement("keyword", "kitchen");
        navigateBack();
        typeOnElement("keyword", "Tops");

    }
}
