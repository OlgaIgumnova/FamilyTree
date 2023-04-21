import java.sql.Date;

import src.Gender;

public class Human {
    private String name;
    private Gender gender;
    private Date birthDate;
    private Human father;
    private Human mother;
    private List<Human> children;
}
public Human(String name, Gender gender, Human) {
   this.name = name;
   this.gender = gender;
   this.father = father;
   this.mother = mother;
   children = newArrayList<>();
}    

public  Human(String name, Gender gender) {
    this(name, gender, null, null)
}
public boolean addChild(Human child) {
    if(!children.contains (child)){
        children.add(child);
        return true;
    }
    return false;
}
public String getName() {return name; }

public Date getBirthDate() {
    return birthDate;
}
public  Human getFather() {return father; }

public  Human getMother() {return mother; }

public  List<Human> getChildren() {
     return children; 
}

public void setBirthDate(Date birthDate) {
    this.birthDate = birthDate;
}

public void setFather(Human father) {
    this.father = father;
}

public void setMother(Human mother) {
    this.mother = mother;
}

public Gender getGender() {
    return gender;
}

public String getInfo(){
   StringBuilder sb = new StringBuilder();
   sb.append("имя: ");
   sb.append(name);
   sb.append(", ");
   sb.append(getMotherInfo());
   sb.append(", ")
   sb.append(getFatherInfo());
   sb.append(", ");
   sb.append(getChildrenInfo());
   return sb.toString();
}

public String getMotherInfo() {
   String res = "мать: ";
   if (mother != null){
    res += mother.getName();
   }
   else {
    res += "неизвестна";
   }
   return res;
}

public String getFatherInfo() {
    String res = "отец: ";
    if (father != null){
     res += father.getName();
    }
    else {
     res += "неизвестный";
    }
    return res;

public String() {
    super();
}
}
