package org.example;

import java.util.Scanner;

public class APP {
    Scanner sc;
    APP(Scanner sc){
        this.sc = sc;
    }

    void run(){
        System.out.println("== 명언 앱 ==");
        while(true){
            System.out.print("명령) ");
            String command = sc.nextLine();

            if(command.equals("종료")){
                break;
            }
        }
    }


}
