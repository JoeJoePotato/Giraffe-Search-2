package org.jointheleague.level7.giraffe2.domain;

import org.jointheleague.level7.giraffe2.repository.dto.DNDResponse;
import org.jointheleague.level7.giraffe2.repository.dto.LocResponse;

import java.util.List;

public class Pojo {

    String title;
    String subtitle;
    String bodyText;

    @Override
    public String toString() {
        return "Pojo{" +
                "title='" + title + '\'' +
                ", subtitle='" + subtitle + '\'' +
                ", bodyText='" + bodyText + '\'' +
                '}';
    }

    public Pojo(DNDResponse result) {

        title = compileTitle(result);
        subtitle = compileSubtitle(result);
        bodyText = compileBodyText(result);
        System.out.println(toString());
    }

    public String compileTitle(DNDResponse result) {
        System.out.println(result.getLevel());
        return result.getName();
    }

    public String compileSubtitle(DNDResponse result) {
        String sub="";
        int i = result.getLevel();

        sub+=i;
        if(i==1) {
            sub+="st";
        }else if(i==2){
            sub+="nd";
        }else if(i==3){
            sub+="rd";
        }else{
            sub+="th";
        }
        sub+=" Level";
        sub+= result.getSchool().getName();

        sub+="\n Components: ";
        for(int j=0; j< result.getComponents().size(); j++){
            sub+= result.getComponents().get(j)+" ";
        }
        if(result.getComponents().contains("M")){
            sub+=result.getMaterial()+" ";
        }

        if(result.getRange() != null){
            sub+="\n Range: "+ result.getRange();
        }

        if(result.getRitual()){
            sub+="\n (Can be cast as a Ritual)";
        }

        return sub;
    }


    public String compileBodyText(DNDResponse result) {
        String bod="";
        for(int j=0; j< result.getDesc().size(); j++){
            bod+= result.getDesc().get(j)+"\n";
        }
        return bod;
    }

}
