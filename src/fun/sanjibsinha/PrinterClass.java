package fun.sanjibsinha;

import java.util.Scanner;

class MyPrinter{
    Boolean isWorking = false;
    Integer papersOnTray = 0;
    Integer paperToPrint = 0;
    Integer remainingPapers = 0;
    public void trayOpen(){
        System.out.println("Printer's tray is open, give papers.");
    }
    public int howManyPapersWantToPrint(int paperToPrint){
        this.paperToPrint = paperToPrint;
        return paperToPrint;
    }
    public int takePapers(int papers){
        this.papersOnTray = papers;
        return papers;
    }
    public void processOrder(){
        remainingPapers = takePapers(papersOnTray) - howManyPapersWantToPrint(paperToPrint);
        System.out.println("The remaining papers on tray are : " + remainingPapers);
    }
}

public class PrinterClass {

    public static void main(String[] args) {
        MyPrinter printer = new MyPrinter();
        printer.trayOpen();
        printer.isWorking = true;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of papers on tray :");
        printer.papersOnTray = sc.nextInt();
        System.out.println("Enter how many papers you want to print : ");
        printer.paperToPrint = sc.nextInt();
        if(printer.isWorking){
            printer.takePapers(printer.papersOnTray);
            printer.howManyPapersWantToPrint(printer.paperToPrint);
            printer.processOrder();

        } else {
            System.out.println("Printer is out of order.");
        }

    }
}
