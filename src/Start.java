import java.util.Scanner;
public class Start {
  public static void main(String[] args) {
    User c1 = new User();
    System.out.print("닉네임을 입력하세요\n>> ");

    Scanner keyScanner = new Scanner(System.in);
    c1.id = keyScanner.nextLine();

    while (true) {
      System.out.println("클래스를 선택하세요");
      System.out.print("knights(1), Assasin(2)\n>> ");
      int sClass = Integer.parseInt(keyScanner.nextLine());

      if (sClass == 1) {
        c1.job = "Knights";
        c1.knights();
        break;
      }
      else if (sClass == 2) {
        c1.job = "Assasin";
        c1.assasin();
        break;
      } else {
        System.out.println("1 or 2를 입력해주세요\n");
        continue;
      }
    }

    c1.info();


  }
}
