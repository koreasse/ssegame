public class User {

  String id;
  String job;
  int att;
  int def;
  int hp;


  void knights() {
    this.att = 15;
    this.def = 15;
    this.hp = 150;
  }

  void assasin() {
    this.att = 25;
    this.def = 10;
    this.hp = 100;
  }

  void info() {
    System.out.println("닉네임: " + this.id);
    System.out.println("클래스: " + this.job);
    System.out.println("공격력: " + this.att);
    System.out.println("방어력: " + this.def);
    System.out.println("Hp: " + this.hp);
  }

}
