package packdemo.demo;

import java.io.File;
import java.io.IOException;

public class FileDemo {

	// 절대 경로 : 최상위 경로(C:, D:)로 부터 파일이 위치한 상대 경로를 포함한 경로
	// 상대 경로 : 현재 위치에서 파일의 이름과 확장자만 가지고 찾는 경로
	// 정규 경로 (표준 경로) : 최상위 경로로 부터 최단 경로를 포함한 경로 (시스템에 한개만 존재)

	// 입력받은 경로
	File file = null;

	String absolutePath = "";
	String canonicalPath = "";
	String fullPath = "";
	String parentPath = "";
	String fileName = "";
	String[] filePathArr = { "" };

	// long 타입 초기화 경우 뒤에 L을 붙여주면 됨
	long fileLength = 0L;
	long fileLastModified = 0L;

	// 전체경로로 파일 생성
	public FileDemo(String _filePath) {
		this.file = new File(_filePath);

		FileCheck(this.file);
		IsFileDirectory(this.file);
		SetInfo();
	}
	// 부모경로와 파일이름으로 파일 생성
	public FileDemo(String _parentPath, String _fileName) {
		this.file = new File(_parentPath, _fileName);

		FileCheck(this.file);
		IsFileDirectory(this.file);
		SetInfo();
	}
	

	public void FileCheck(File _file) {
		// 파일 존재 여부 체크
		if (!_file.exists()) {
			System.out.println("Not file in filePath");

			// createNewFile() 내부에서 try/catch 로 IOException 타입을 던져줌
			try {
				_file.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	// 파일의 대한 정보를 가져와 세팅
	public void SetInfo() {
		try {
			// 절대 경로
			this.absolutePath = this.file.getAbsolutePath();
			// 정규 경로 String 반환 인데 try/catch 로 되어있음 -> IOException 타입 반환
			this.canonicalPath = this.file.getCanonicalPath();
			// 전체 경로
			this.fullPath = this.file.getPath();
			// 부모 경로
			this.parentPath = this.file.getParent();
			// 파일/폴더 이름
			this.fileName = this.file.getName();
			// 경로의 폴더에 있는 파일을 문자열 배열로 리턴 (파일 명으로 경로를 찾을경우 null) 
			this.filePathArr = this.file.list();
			// 파일의 크기 리턴
			this.fileLength = this.file.length();
			// 해당 경로 파일 최종 수정 일잔 리턴
			this.fileLastModified = this.file.lastModified();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
	// 파일의 정보 출력
	public void ShowData(String _title) {
		System.out.println("=====[" + _title + "]=====");
		
		System.out.println("절대경로 : " + this.absolutePath);
		System.out.println("정규경로 : " + this.canonicalPath);
		System.out.println("전체경로 : " + this.fullPath);
		System.out.println("부모경로 : " + this.parentPath);
		System.out.println("파일이름 : " + this.fileName);
		System.out.println("파일길이 : " + this.fileLength);
		System.out.println("경로 파일 최종 수정일자 : " + this.fileLastModified);

		if (null != filePathArr) {
			System.out.println("[ fileName[] ]");
			for (int i = 0; i < filePathArr.length; i++) {
				System.out.print("[" + this.filePathArr[i] + "] ");
			}
			System.out.println();
		}
		
		CheckReadWrite(this.file);
		
		System.out.println("====================");
	}
	// 파일의 읽기/쓰기 권한체크
	public void CheckReadWrite(File _file) {
		if (null == _file) {
			System.out.println("File Is Null");
		}
		
		if (_file.canRead()) {
			System.out.println(_file.getName() + " can Read");
		} else {
			System.out.println(_file.getName() + " can't Read");
		}
		if (_file.canWrite()) {
			System.out.println(_file.getName() + " can Write");
		} else {
			System.out.println(_file.getName() + " can't Write");
		}
	}
	// 객체의 파일, 폴더 여부 체크
	public void IsFileDirectory(File _file) {
		if (_file.isFile()) {
			System.out.println(_file.getName() + " is File");
		}
		if (_file.isDirectory()) {
			System.out.println(_file.getName() + " is Directory");
		}
	}

	public static void main(String[] args) {

		// 전체 경로
		String filePath = "C:\\Users\\LeeJinGun\\Desktop\\SolDesk\\JAVA\\JAVA_WS\\FileTest";
		// 부모 경로
		String parentPath = "C:\\Users\\LeeJinGun\\Desktop\\SolDesk\\JAVA\\JAVA_WS\\FileTest";
		// 파일 이름
		String fileName = "Test_01.txt";
		
		String fileName2 = "TestFile_01.txt";
		
		FileDemo fileDemo1 = new FileDemo(filePath);
		FileDemo fileDemo2 = new FileDemo(parentPath, fileName);
		FileDemo fileDemo3 = new FileDemo(fileName);
		
		FileDemo fileDemo4 = new FileDemo(fileName2);
		
		//fileDemo1.ShowData("file1");
		//fileDemo2.ShowData("file2");
		//fileDemo3.ShowData("file3");
		fileDemo4.ShowData("file4");
		
	}

}
