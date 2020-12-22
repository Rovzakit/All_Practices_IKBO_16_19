package Editor;

import java.io.IOException;
import java.util.Scanner;


public class Carcass {
    IDocument doc;
    ICreateDocument doc1;
    private void New() throws IOException {
        int i;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберите тип документа");
        System.out.println("1.Текстовый документ");
        i=scanner.nextInt();
        if(i==1)
            NewText();
        System.out.println("Документ создан");
    }
    private void Open() throws IOException {
        int i;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберите тип документа");
        System.out.println("1.Текстовый документ");
        i=scanner.nextInt();
        if(i==1)
            OpenText();
        System.out.println("Документ открыт");

    }
    private void Exit() throws IOException {
        int i;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберите тип документа");
        System.out.println("1.Текстовый документ");
        i=scanner.nextInt();
        if(i==1)
            ExitText();
        System.out.println("Прекращение работы");
    }
    private void Save() throws IOException {
        int i;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберите тип документа");
        System.out.println("1.Текстовый документ");
        i=scanner.nextInt();
        if(i==1)
            SaveText();
        System.out.println("Документ сохранен");
    }
    private void NewText() throws IOException {
        doc1 = new Create_Document();
        doc = doc1.CreateNew();
        doc.create();
    }
    private void OpenText() throws IOException {
        doc1= new Create_Document();
        doc=doc1.CreateOpen();
        doc.open();
    }
    private void ExitText() throws IOException {
        doc.close();
    }
    private void SaveText() throws IOException {
        doc.save();
    }
    public Carcass() throws IOException {
        while (true) {
            int i=0;
            System.out.println("Выберите пункт меню");
            System.out.println("1.New");
            System.out.println("2.Open");
            System.out.println("3.Save");
            System.out.println("4.Exit");
            Scanner scanner = new Scanner(System.in);
            i=scanner.nextInt();
            if (i==4){
                Exit();
                break;
            }
            else if (i==1){
                New();
            }
            else if (i==2){
                Open();
            }
            else if (i==3){
                Save();
            }
        }
    }
}
