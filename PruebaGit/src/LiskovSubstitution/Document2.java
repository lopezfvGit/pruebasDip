package LiskovSubstitution;

public class Document2 
	{
	    private String data;
	    private String fileName;

	    public Document2(String fileName)
	    {
	        this.fileName = fileName;
	    }

	    public void open() {
	        System.out.println("Opening " + fileName);
	    }

	    public String getData()
	    {
	        return data;
	    }

	    public void setData(String data)
	    {
	        this.data = data;
	    }

	    public String getFileName()
	    {
	        return fileName;
	    }

	    public void setFileName(String fileName)
	    {
	        this.fileName = fileName;
	    }
	}


