# Opre-HF2

## Operációs rendszerek 2.Hf 2k20
### Lapcsere megvalósítása

Becsült programozási idő: ~5 óra

A feladatbeküldés általános és FONTOS tudnivalói elolvashatók itt.

Készítsen egy programot Java vagy Python nyelven, amely egy lapcsere-rendszer működését szimulálja!

A program bemeneteként memóriaműveletek során hivatkozott lapok azonosítóit kapja a hivatkozásuk sorrendjében. Kimeneteként a végrehajtott lapcserék eredményeképpen lefoglalt fizikai memóriakeretek azonosítóit és a laphibák számát adja vissza.

A rendszerben 4 memóriakeret található, amelyek kezdetben mind üresek. Az induláskor a lapok a cserehelyen találhatók.

A lapokat számok (1-99), a kereteket betűk (A,B,C és D) jelölik.
Bemenet (standard input, stdin)

Egyetlen sorban a lapokra történő hivatkozások egymástól vesszővel elválasztva. Például:

1,2,3,4,1,5,1

A bemenet végét EOF jelzi (előtte soremelés, üres sor lehet). Ekkor kell a kimenetre kiírni az eredményt.
Kimenet (standard output, stdout)

A kimeneten az első sorban a bemeneti memóriahivatkozások kiszolgálásához lefoglalt memóriakeretek betűjelei szerepelnek a megfelelő sorrendben, szóközök nélkül, egybeírva, majd a következő sorban a laphibák száma. A kiírt eredmények előtt, után üres karakterek, további sorok ne legyenek!
Amennyiben egy memóriahivatkozáshoz nem kellett új keretet foglalni (már a memóriában volt a lap), a kimeneten az adott pozícióban "-" jel jelenik meg.
Ha egy memóriafoglalás nem teljesíthető (nincs szabad keret és egyetlen keret sem szabadítható fel), akkor a kimeneten "*" karakter jelenik meg (a műveletet nem ismétli meg az algoritmus). Ez utóbbi eset értelemszerűen nem minden algoritmusnál fordulhat elő.
Megvalósítandó algoritmus

Újabb esély (SC) lapcsere

A program írja ki az algoritmus szerinti memóriafoglalásokat és a laphibák számát!
Pl. a fenti bemenetre adott válasz:

ABCD-B-
5

Megjegyzés: az implementálandó algoritmus a "használt" jelzést akkor állítja be, amikor a már bent levő lapot használták (azaz éppen nem volt laphiba).
Értékelés

Összesen 3 pont jár, ha minden teszten átmegy a megoldás. Arányosan kevesebb pont szerezhető, ha nem minden esetben működik helyesen a beküldött program.
Technikai információk

A programot a HF portálon kell leadni a megadott határidőig egyetlen ZIP fájlba csomagolva. A feltöltött fájlok (a ZIP és a tartalmának) neve ékezetes betűt ne tartalmazzon!

A beküldött Java programnak tartalmaznia kell egy "Main" nevű osztályt, melynek része a feladatot megoldó "main" függvény. A Java program tetszőleges számú forrásfájlból állhat. A program nem használhat a standard inputon és outputon kívül semmilyen más erőforrást, így nem végezhet fájlműveleteket és nem nyithat hálózati kapcsolatokat.
Python megoldás beküldése esetén a Python 3 verzióval kompatibilis megoldásokat fogadunk el, csak standard függvények használhatók (külső könyvtár, pl. NumPy nem), és a feltöltött ZIP fájlban egy db .py fájl lehet, más nem. Itt sem végezhetnek fájlműveleteket, nem nyithatnak meg hálózati kapcsolatokat.

Last modified: Monday, 4 May 2020, 11:21 AM
