package momentoPattern;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        History history = new History();
        Editor editor = new Editor();
        editor.setContent("Hello1");
        history.update(editor.createState());
        editor.setContent("Hello2");
        history.update(editor.createState());
        editor.setContent("Hello3");
        history.update(editor.createState());
        editor.setContent("Hello4");
        Scanner scanner = new Scanner(System.in);
        int ch = scanner.nextInt();
        while(ch!=3){
            System.out.println(editor.getContent());
            switch (ch){
                case 1:
                    history.update(editor.createState());
                    editor.setContent(scanner.next());
                    break;
                case 2:
                    editor.restore(history.retrieve());
                    break;
            }
            ch = scanner.nextInt();
        }

//        editor.restore(history.retrieve());
//        System.out.println(editor.getContent());
//
//        editor.restore(history.retrieve());
//        System.out.println(editor.getContent());
//
//        editor.restore(history.retrieve());
//        System.out.println(editor.getContent());
//
//        editor.restore(history.retrieve());
//        System.out.println(editor.getContent());
//
//        editor.restore(history.retrieve());
//        System.out.println(editor.getContent());
    }
}
