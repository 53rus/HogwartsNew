import java.util.SortedMap;

public class Methods {

    public void chooseStudent (Hogwarts name) {
        System.out.println(name);
    }

    public void compareHogwartsStudents(Hogwarts first, Hogwarts second) {
        if (first.getMagicPower() > second.getMagicPower()) {
            System.out.println("Студент: " + first.getName() + " обладает больщей силой магии, чем студент: " + second.getName() + " " + first.getMagicPower() + " против " + second.getMagicPower());
        } else if (first.getMagicPower() == second.getMagicPower()) {
            System.out.println("Cтуденты " + first.getName() + " и " + second.getName() + " обладают одинаковой силой магии " + first.getMagicPower() + " равно " + second.getMagicPower());
        } else {System.out.println("Студент: " + second.getName() + " обладает больщей силой магии, чем студент: " + first.getName() + " " + second.getMagicPower() + " против " + first.getMagicPower());
        }
    }

    public void compareGriffindorStudents (Griffindor first, Griffindor second) {
        int firstPoint = first.getBravery() + first.getHonor() + first.getNobility();
        int secondPoint = second.getBravery() + second.getHonor() + second.getNobility();
        if (firstPoint > secondPoint) {
            System.out.println("Студент: " + first.getName() + " обладает большим количеством баллов, чем студент : " + second.getName() + " " + firstPoint + " против " + secondPoint + ". Факультет Гриффиндор");
        } else if (firstPoint == secondPoint) {
            System.out.println("Студенты: " + first.getName() + " и " + second.getName() + " обладают одинаковым колличеством баллов " + firstPoint + " равно " + secondPoint + " . Факультет Гриффиндор");
        } else {
            System.out.println("Студент: " + second.getName() + " обладает большим количеством баллов, чем студент : " + first.getName() + " " + secondPoint + " против " + firstPoint + ". Факультет Гриффиндор");
        }
    }

    public void comparePuffenduyStudents (Puffenduy first, Puffenduy second) {
        int firstPoint = first.getHardWork() + first.getLoyalty() + first.getHonesty();
        int secondPoint = second.getHardWork() + second.getLoyalty() + second.getHonesty();
        if (firstPoint > secondPoint) {
            System.out.println("Студент: " + first.getName() + " обладает большим количеством баллов, чем студент : " + second.getName() + " " + firstPoint + " против " + secondPoint + ". Факультет Пуффендуй");
        } else if (firstPoint == secondPoint) {
            System.out.println("Студенты: " + first.getName() + " и " + second.getName() + " обладают одинаковым колличеством баллов " + firstPoint + " равно " + secondPoint + " . Факультет Пуффендуй");
        } else {
            System.out.println("Студент: " + second.getName() + " обладает большим количеством баллов, чем студент : " + first.getName() + " " + secondPoint + " против " + firstPoint + ". Факультет Пуффендуй");
        }
    }

    public void compareSlizerinStudents (Slizerin first, Slizerin second) {
        int firstPoint = first.getCunning() + first.getDetermination() + first.getAmbition() + first.getResourcefulness() + first.getLustForPower();
        int secondPoint = second.getCunning() + second.getDetermination() + second.getAmbition() + second.getResourcefulness() + second.getLustForPower();
        if (firstPoint > secondPoint) {
            System.out.println("Студент: " + first.getName() + " обладает большим количеством баллов, чем студент : " + second.getName() + " " + firstPoint + " против " + secondPoint + ". Факультет Слизерин");
        } else if (firstPoint == secondPoint) {
            System.out.println("Студенты: " + first.getName() + " и " + second.getName() + " обладают одинаковым колличеством баллов " + firstPoint + " равно " + secondPoint + " . Факультет Слизерин");
        } else {
            System.out.println("Студент: " + second.getName() + " обладает большим количеством баллов, чем студент : " + first.getName() + " " + secondPoint + " против " + firstPoint + ". Факультет Слизерин");
        }
    }

    public void compareKogtevranStudents (Kogtevran first, Kogtevran second) {
        int firstPoint = first.getMind() + first.getWisdom() + first.getWit() + first.getCreativity();
        int secondPoint = second.getMind() + second.getWisdom() + second.getWit() + second.getCreativity();
        if (firstPoint > secondPoint) {
            System.out.println("Студент: " + first.getName() + " обладает большим количеством баллов, чем студент : " + second.getName() + " " + firstPoint + " против " + secondPoint + ". Факультет Когтевран");
        } else if (firstPoint == secondPoint) {
            System.out.println("Студенты: " + first.getName() + " и " + second.getName() + " обладают одинаковым колличеством баллов " + firstPoint + " равно " + secondPoint + " . Факультет Когтевран");
        } else {
            System.out.println("Студент: " + second.getName() + " обладает большим количеством баллов, чем студент : " + first.getName() + " " + secondPoint + " против " + firstPoint + ". Факультет Когтевран");
        }
    }
}
