## ***Document***

### Data Storing 
เก็บข้อมูลตัวละครไว้ใน class RPGCharacter ประกอบไปด้วย
- name ชื่อ
- level เลเวล
- hp ค่าเลือด
- mana ค่ามานา
- runSpeed ความเร็วการวิ่ง
- equippedSword ติดตั้งดาบ
- equippedShield ติดตั้งโล่

สร้าง class แยกสำหรับ Sword และ Shield เพื่อให้ง่ายต่อการใช้งานและมีความเป็นระเบียบ
โดยเก็บข้อมูลเกี่ยวกับอุปกรณ์เหล่านี้แยกไว้ ประกอบด้วย
- name ชื่อ
- level เลเวล
- damage ค่าความเสียหาย

### Operation
***การโจมตีและป้องกัน (attack/defend):***

ใช้ method attack และ defend ใน class RPGCharacter เพื่อคำนวณความเสียหายและการป้องกันโดยพิจารณาอุปกรณ์ที่ติดตั้งอยู่ เช่น ดาบและโล่
ทำการคำนวนผ่าน calculateSwordDamage() และ calculateShieldDefense()

***การติดตั้งอุปกรณ์ (Equipping):***

ทำการติดตั้งดาบ (equipSword), ติดตั้งโล่ (equipShield) เพื่ออัปเดตสถานะของตัวละคร

***การเลื่อนเลเวลอุปกรณ์ (swordlevelUp / shieldlevelUp):***

ทำการดำเนินการ swordLevelUp และ shieldLevelUp ใน class Sword และ Shield เพื่อจัดการกับค่าสถานะของอุปกรณ์


### Computing
***levelUp()***
- ใช้ method levelUp ใน class RPGCharacter เพื่อเพิ่มเลเวลของตัวละครและเพิ่มค่าสถานะของตัวละคร (hp, mana, runSpeed)

***calculateSwordDamage()***
- ใช้ method calculateSwordDamage ใน class RPGCharacter เพื่อเช็คว่าตัวละครติดตั้งดาบไว้หรือไม่ ถ้าติดตั้ง ให้ return ค่าความเสียหายของดาบกลับไป

***calculateShieldDefense()***
- ใช้ method calculateShieldDefense ใน class RPGCharacter เพื่อเช็คว่าตัวละครติดตั้งโล่ไว้หรือไม่ ถ้าติดตั้ง ให้ return ค่าป้องกันของโล่กลับไป

***updateRunSpeed()***
- ใช้ method updateRunSpeed ใน class RPGCharacter เพื่อคำนวนความเร็ววิ่งของตัวละคร โดยตัวละครจะวิ่งช้าลงเมื่อสวมใส่อุปกรณ์ต่าง ๆ

