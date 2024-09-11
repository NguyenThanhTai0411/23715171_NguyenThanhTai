package Bai9_congNhan;

import java.util.Scanner;

public class Main 
{
	public static void main(String[] args)
	{
		Scanner scanner =new Scanner(System.in);
		System.out.println("Nhập số lượng công nhân: ");
		int n= scanner.nextInt();
		DanhSachCongNhan danhSach= new DanhSachCongNhan(n);
		for(int i=0;i<n;i++)
		{
			System.out.println("Nhập thông tin công nhân thứ "+(i+1));
			System.out.println("Mã công Nhân: ");
			String maCN=scanner.next();
			System.out.println("Họ: ");
			String ho=scanner.next();
			System.out.println("Tên: ");
			String ten=scanner.next();
			System.out.println("Số sản phẩm: ");
			int SoSP= scanner.nextInt();
			CONGNHAN cn=new CONGNHAN(maCN, ho, ten, SoSP);
			danhSach.themCongNhan(cn);
		}
		System.out.println("Thông tin toàn bộ công nhân:");
		danhSach.xuatThongTin();
		System.out.println("Số Lượng công nhân trong danh sách: "+danhSach.soLuongCongNhan());
		System.out.println("Công Nhân làm trên 200 sản phẩm");
		danhSach.xuatCongNhanTren200SP();
		danhSach.sapXepGiamDan();
		System.out.println("Danh sách giảm dần theo sản phẩm: ");
		danhSach.xuatThongTin();
		scanner.close();
	}
}
