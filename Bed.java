package buffer4;
public class Bed{
private int Bedno;
Patient_Info p = new Patient_Info();

public Bed() {
super();
this.Bedno=0;
}
public int BedAllotment(int record) {

switch(record) {
case 1:
Bedno=record;
case 2:
Bedno=record;
case 3:
Bedno=record;
case 4:
Bedno=record;
case 5 :
Bedno=record;

}
return Bedno;
}
}