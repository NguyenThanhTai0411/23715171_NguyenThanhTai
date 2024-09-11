package Stt33_23715171_nguyenthanhtai;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class DanhSachCongNhan 
{
	private ArrayList<CONGNHAN> danhSach;
	private int n;
	public DanhSachCongNhan(int n) 
	{
		this.n=n;
		danhSach = new ArrayList<>();
	}
	public boolean themCongNhan(CONGNHAN cn) 
	{
		if(danhSach.size() < n) 
		{
			return  danhSach.add(cn);
		}
		return false;
	}
	public void xuatThongTin() 
	{
		for (CONGNHAN cn: danhSach) 
		{
			System.out.println(cn);
		}
	}
	public int soLuongCongNhan()
	{
		return danhSach.size();
	}
	public void xuatCongNhanTren200SP()
	{
		for(CONGNHAN cn: danhSach)
		{
			if(cn.getmSoSP()>200)
			{
				System.out.println(cn);
			}
		}
	}
	public void sapXepGiamDan()
	{
		Collections.sort(danhSach, new Comparator<CONGNHAN>() 
		{
			public int compare(CONGNHAN cn1, CONGNHAN cn2) 
			{
				return cn2.getmSoSP() -cn1.getmSoSP();
			}
		});
	}
}
