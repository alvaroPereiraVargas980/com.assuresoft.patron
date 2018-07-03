package com.assuresoftBuilder;

public class BuilderDemo {
    public static void main(String[] arg){
        CDBuilder cdBuilder=new CDBuilder();
        CDtype cdType1=cdBuilder.buildSony();
        cdType1.showItems();

        CDtype cdType2=cdBuilder.buildSamsung();
        cdType2.showItems();

    }
}
