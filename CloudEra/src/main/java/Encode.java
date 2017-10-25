import java.io.File;

import org.apache.commons.io.FileUtils;

import com.cloud.util.EncodingDetect;


public class Encode {

	public static void main(String[] args) {
		
		String fileEncode=EncodingDetect.getJavaEncode("D://1.txt");      
		System.out.println(fileEncode);

	}

}
