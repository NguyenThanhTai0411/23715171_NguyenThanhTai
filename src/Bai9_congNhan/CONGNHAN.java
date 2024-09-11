package Bai9_congNhan;

public class CONGNHAN 
{
	private String maCN,mHo,mTen;
	private int mSoSP;
	public String getMaCN() 
	{
		return maCN;
	}
	public void setMaCN(String maCN) throws Exception 
	{
		if (maCN!=null) 
		{
			this.maCN = maCN;
		} 
		else 
		{
			throw new Exception("Loi");
		}
	}
	public String getmHo() 
	{
		return mHo;
	}
	public void setmHo(String mHo) throws Exception
	{
		if (mHo!=null) 
		{
			this.mHo = mHo;
		} 
		else 
		{
			throw new Exception("Loi");
		}
	}
	public String getmTen() {
		return mTen;
	}
	public void setmTen(String mTen) throws Exception 
	{
		if (mTen!=null)
		{
			this.mTen = mTen;
		} 
		else
		{
			throw new Exception("Loi");
		}
	}
	public int getmSoSP() 
	{
		return mSoSP;
	}
	public void setmSoSP(int mSoSP) throws Exception 
	{
		if (mSoSP>0) 
		{
			this.mSoSP = mSoSP;
		}
		else 
		{
			throw new Exception("Loi");
		}
	}
	public CONGNHAN() 
	{
		this.maCN="";
		this.mHo="";
		this.mSoSP=0;
		this.mTen="";
	}
	public CONGNHAN(String maCN, String mHo, String mTen, int mSoSP)
	{
		this.maCN = maCN;
		this.mHo = mHo;
		this.mTen = mTen;
		this.mSoSP = mSoSP;
	}
	public double tinhLuong() 
	{
		double dongia;
		if( mSoSP<=199)
		{
			dongia=0.5;
		}
		else if(mSoSP<=399)
		{
			dongia=0.55;
		}
		else if( mSoSP<=599)
		{
			dongia=0.6;
		}
		else
		{
			dongia=0.65;
		}
		return mSoSP*dongia;

	}
	@Override
	public String toString() 
	{
		return "CongNhan [maCN= "+ maCN+" Họ= "+mHo+" Tên= "+mTen+" Số Sản Phẩm= "+mSoSP+" Lương= "+ tinhLuong()+" ]";
	}		
}
