public class Main {
    public static void main(String[] args) {
        Methods methods = new Methods();
        Griffindor garry = new Griffindor("Гарри Потер", 70, 70, 60, 70, 90);
        Griffindor germiona = new Griffindor("Гермиона Грейнджер", 65, 70, 55, 67, 87);
        Griffindor ron = new Griffindor("Рон Уизли", 66, 67, 57, 58, 59);
        Slizerin drako = new Slizerin("Драко Малфой", 73, 69, 65, 43, 67, 55,66);
        Slizerin grehem = new Slizerin("Грэхэм Монтегю", 66, 67, 69, 87, 93, 45, 67);
        Slizerin gregori = new Slizerin("Грегори Гойл", 76, 54, 43, 78, 43, 76, 32);
        Puffenduy zahatiya = new Puffenduy("Захария Смит", 56, 67, 45, 34, 12);
        Puffenduy sedrik = new Puffenduy("Седрик Диггори", 65, 54, 76, 87, 93);
        Puffenduy dzhastin = new Puffenduy("Джастин Финч-Флетчли", 41, 53, 39, 76, 84);
        Kogtevran chzhou = new Kogtevran("Чжоу Чанг", 68, 54, 93, 25, 76, 32);
        Kogtevran padma = new Kogtevran("Падма Патил", 54, 32, 1, 1, 1, 11);
        Kogtevran markus = new Kogtevran("Маркус Белби", 64, 65, 11, 13, 14, 11);
        methods.chooseStudent(padma);
        methods.compareHogwartsStudents(drako,chzhou);
        methods.compareGriffindorStudents(ron,garry);
        methods.compareKogtevranStudents(markus,padma);
        methods.comparePuffenduyStudents(zahatiya,sedrik);
        methods.compareSlizerinStudents(drako,gregori);
    }
}