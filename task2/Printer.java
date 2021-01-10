package task2;

public class Printer implements Print {

    public void printPDF() {
        System.out.println("Я умею печатать файлы PDF");
    }

    public void printWord() {
        System.out.println("Я умею печатать файлы doc");
    }

    public static void main(String[] args) {
        Printer p = new Printer();
        p.printPDF();
        p.printWord();
    }
}
