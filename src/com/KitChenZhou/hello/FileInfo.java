package com.KitChenZhou.hello;
/**
 * 
 * @author CL
 *
 */
public class FileInfo {

	private String file;
	private Long length ;
	
	public FileInfo() {
	}

	public FileInfo(String file, Long length) {
		super();
		this.file = file;
		this.length = length;
	}

	@Override
	public String toString() {
		return "FileInfo [file=" + file + ", length=" + length + "]";
	}

	public String getFile() {
		return file;
	}

	public void setFile(String file) {
		this.file = file;
	}

	public Long getLength() {
		return length;
	}

	public void setLength(Long length) {
		this.length = length;
	}
	
}
