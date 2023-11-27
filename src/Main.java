public class Main {

    public static void main(String[] args) {

        // สร้างตัวละคร
        RPGCharacter player = new RPGCharacter("Hero", 1);
        displayPlayerInfo(player);
        //อัพเวลตัวละคร
        player.levelUp();
        displayPlayerInfo(player);
        //สร้างดาบกับโล่
        Sword sword = new Sword("Muramasa", 1, 15);
        //ใส่ดาบ
        player.equipSword(sword);
        displayPlayerInfo(player);
        //สร้างplayer2
        RPGCharacter enemy = new RPGCharacter("Monster", 1);
        displayPlayerInfo(enemy);
        //โจมตีplayer2
        player.attack(enemy);
        //โชว์สถานะplayer2หลังจากโจมตี
        displayPlayerInfo(enemy);
        //สร้างโล่และใส่โล่ให้player2
        Shield shield2 = new Shield("Iron Shield", 1, 10);
        enemy.equipShield(shield2);
        displayPlayerInfo(enemy);
        //player2ตีplayer1
        enemy.attack(player);
        displayPlayerInfo(player);
        //เพิ่มlevelดาบplayer1
        sword.swordlevelUp();
        displayPlayerInfo(player);
        //เพิ่มlevelให้กับโลห์ของplayer2
        shield2.shieldlevelUp();
        displayPlayerInfo(enemy);
        //ใส่โลห์ให้กับผู้เล่น1
        Shield shield1 = new Shield("Golden Shield", 1, 20);
        player.equipShield(shield1);
        displayPlayerInfo(player);
        //player2levelอัพ
        enemy.levelUp();
        displayPlayerInfo(enemy);
    }

    private static void displayPlayerInfo(RPGCharacter character) {
        character.displayInfo();
    }
}

//อ้างอิงแลปนี้ได้ใช่CHATGPTในการช่วยเหลือบางส่วน