public class ContohIfElse{
public static void main(String args[]){
	char hurufAwal = 'a';
		System.out.print("Masukkan huruf awal nama anda : ");
		try{
			hurufAwal = (char)System.in.read();	
		}catch(Exception e){
			System.out.println("Salah input ko kanda");	
		}
		if (hurufAwal == 'a')
		   System.out.println("apa namamu amin ?");
		else if (hurufAwal == 'b')
		   System.out.println("apa namamu bambang ?");
		else if (hurufAwal == 'c')
		   System.out.println("apa namamu cleo ?");
		else if (hurufAwal == 'd')
		   System.out.println("apa namamu daud ?");
		else if (hurufAwal == 'e')
		   System.out.println("apa namamu endang ?");
		else
		   System.out.println("aku tidak bisa menebak");
}		
}