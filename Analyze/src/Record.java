public class Record
	{
	private String letterCode;
	private int numberCode;

	Record(String l, int n)
		{
		letterCode = l;
		numberCode = n;
		}

	public String getLetterCode()
		{
		return letterCode;
		}

	public void setLetterCode(String letterCode)
		{
		this.letterCode = letterCode;
		}

	public int getNumberCode()
		{
		return numberCode;
		}

	public void setNumberCode(int numberCode)
		{
		this.numberCode = numberCode;
		}
}