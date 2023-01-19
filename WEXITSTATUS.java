import java.io.*;
import java.util.Scanner;
import java.util.ArrayList;
public class WEXITSTATUS {
    public static void main(String[] args) {
        int CntES0=0,CntES1=0,CntES2=0,CntES3To124=0,CntES125=0,CntES126=0,CntES127=0,CntES128=0,CntES129To192=0;
        ArrayList<String> JobIDES0 = new ArrayList<>();
        ArrayList<String> JobIDES1 = new ArrayList<>();
        ArrayList<String> JobIDES2 = new ArrayList<>();
        ArrayList<String> JobIDES3To124 = new ArrayList<>();
        ArrayList<String> JobIDES125 = new ArrayList<>();
        ArrayList<String> JobIDES126 = new ArrayList<>();
        ArrayList<String> JobIDES127 = new ArrayList<>();
        ArrayList<String> JobIDES128 = new ArrayList<>();
        ArrayList<String> JobIDES129To192 = new ArrayList<>();
        
        try{
            Scanner inputStream=new Scanner(new FileInputStream("C:\\Users\\shumi\\Downloads\\extracted_log"));
            while(inputStream.hasNextLine()){
                String input=inputStream.nextLine();
                int indexJobIDStart=input.indexOf("JobId=")+6;
                int indexJobIDStop=input.indexOf("JobId=")+11;
                
                if(input.contains("WEXITSTATUS 0")){
                    JobIDES0.add(input.substring(indexJobIDStart,indexJobIDStop));
                    CntES0++;
                }
               
                for(int i=3;i<125;i++) {
                if (input.contains("WEXITSTATUS " +i)) {
                    JobIDES3To124.add(input.substring(indexJobIDStart,indexJobIDStop));
                    CntES3To124++;
                    }
                }
                
                if(input.contains("WEXITSTATUS 125")){
                    JobIDES125.add(input.substring(indexJobIDStart,indexJobIDStop));
                    CntES125++;
                }
                if(input.contains("WEXITSTATUS 126")){
                    JobIDES126.add(input.substring(indexJobIDStart,indexJobIDStop));
                    CntES126++;
                }
                if(input.contains("WEXITSTATUS 127")){
                    JobIDES127.add(input.substring(indexJobIDStart,indexJobIDStop));
                    CntES127++;
                }
                if(input.contains("WEXITSTATUS 128")){
                    JobIDES128.add(input.substring(indexJobIDStart,indexJobIDStop));
                    CntES128++;
                }
                
                for(int i=129;i<193;i++) {
                    if (input.contains("WEXITSTATUS " +i)) {
                        JobIDES129To192.add(input.substring(indexJobIDStart,indexJobIDStop));
                        CntES129To192++;
                    }
                }
                if(input.contains("WEXITSTATUS 1")&&input.length()==66){
                    JobIDES1.add(input.substring(indexJobIDStart,indexJobIDStop));
                    CntES1++;
                }
                if(input.contains("WEXITSTATUS 2")){
                    JobIDES2.add(input.substring(indexJobIDStart,indexJobIDStop));
                    CntES2++;
                }
        }
        }catch(FileNotFoundException e){
            System.out.println("File was not found.");
        }
        
        System.out.println("WEXITSTATUS\t\t\t\tCOUNT\t\t\t\tJOB ID");
        System.out.printf("%11s%32d\t\t\t\t",0,JobIDES0.size());
        JobIDES0.forEach(i -> {
            System.out.print(i+" ");
        });
        System.out.println();
        System.out.printf("%11s%32d\t\t\t\t",1,JobIDES1.size());
        JobIDES1.forEach(i -> {
            System.out.print(i+" ");
        });
        System.out.println();
        System.out.printf("%11s%32d\t\t\t\t",2,JobIDES2.size());
        JobIDES2.forEach(i -> {
            System.out.print(i+" ");
        });
        System.out.println();
        System.out.printf("%11s%32d\t\t\t\t","3-124",JobIDES3To124.size());
        JobIDES3To124.forEach(i -> {
            System.out.print(i+" ");
        });
        System.out.println();
        System.out.printf("%11s%32d\t\t\t\t",125,JobIDES125.size());
        JobIDES125.forEach(i -> {
            System.out.print(i+" ");
        });
        System.out.println();
        System.out.printf("%11s%32d\t\t\t\t",126,JobIDES126.size());
        JobIDES126.forEach(i -> {
            System.out.print(i+" ");
        });
        System.out.println();
        System.out.printf("%11s%32d\t\t\t\t",127,JobIDES127.size());
        JobIDES127.forEach(i -> {
            System.out.print(i+" ");
        });
        System.out.println();
        System.out.printf("%11s%32d\t\t\t\t",128,JobIDES128.size());
        JobIDES128.forEach(i -> {
            System.out.print(i+" ");
        });
        System.out.println();
        System.out.printf("%11s%32d\t\t\t\t","129-192",JobIDES129To192.size());
        JobIDES129To192.forEach(i -> {
            System.out.print(i+" ");
        });
        
    }
}
