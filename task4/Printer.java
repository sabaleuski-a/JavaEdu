package task4;

public class Printer extends Print {

    //@Override
    public void printPDF() {
        System.out.println("Я умею печатать файлы PDF");
    }

    //@Override
    public void printWord() {
        System.out.println("Я умею печатать файлы doc");
    }

    public static void main(String[] args) {
        Printer p = new Printer();
        p.printPDF();
        p.printWord();
    }
}
