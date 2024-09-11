
package deiparine.it2c;


public class Output {
    int  num,id,month,credit,loan;
    String name;
    
    
    public void addAppli(int pnum, String pname, int pid, int pmonth, int pcredit, int ploan){
        this.num = pnum;
        this.id = pid;
        this.name = pname;
        this.month = pmonth;
        this.credit = pcredit;
        this.loan = ploan;
        
    }
    public void viewAppli(){
        String status = (month < 30000)? "Disapproved":"Appproved";
        System.out.printf("%-10s %-10s %-10s %-10s %-10s %-10s %-10s\n","APPLICANTS","ID","NAME","MONTH","CREDIT","LOAN","STATUS\n");
        System.out.printf("%-10d %-10d %-10s %-10d %-10d %-10d %-10s\n",
             this.num, this.id, this.name,this.month,this.credit,this.loan,status);
    }
}
