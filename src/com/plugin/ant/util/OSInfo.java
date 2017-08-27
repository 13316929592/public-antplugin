package com.plugin.ant.util;

/**
 * ����ϵͳ�ࣺ
 * ��ȡSystem.getProperty("os.name")��Ӧ�Ĳ���ϵͳ
 * @author isea533
 */
public class OSInfo {
	
	/**
	 * ����ϵͳ����
	 */
	private static String OS = System.getProperty("os.name").toLowerCase();
	
	/**
	 * ����ϵͳ����
	 */
	private static String OSVersion = System.getProperty("os.version").toLowerCase();
	
	/**
	 * �Ƿ���linux
	 * @return true ��
	 */
	public static boolean isLinux(){
		return OS.indexOf("linux")>=0;
	}
	
	/**
	 * @return true ��
	 */
	public static boolean isMacOS(){
		return OS.indexOf("mac")>=0&&OS.indexOf("os")>0&&OS.indexOf("x")<0;
	}
	/**
	 * @return true ��
	 */
	public static boolean isMacOSX(){
		return OS.indexOf("mac")>=0&&OS.indexOf("os")>0&&OS.indexOf("x")>0;
	}
	/**
	 * �Ƿ���windows
	 * @return true ��
	 */
	public static boolean isWindows(){
		return OS.indexOf("windows")>=0;
	}
	
	/**
	 * �Ƿ���windows �ں�6�����ϵ�
	 * @return true ��
	 */
	public static boolean isWindows6(){
		if(OS.indexOf("windows")>=0){
			 try {  
		        double version = Double.parseDouble(OSVersion);  
		        if(version>6){
		        	return true;
		        }
		     } catch (NumberFormatException e) {  
		         return false;  
		     }  
		}
		return false;
	}
	
	/**
	 * @return true ��
	 */
	public static boolean isOS2(){
		return OS.indexOf("os/2")>=0;
	}
	/**
	 * @return true ��
	 */
	public static boolean isSolaris(){
		return OS.indexOf("solaris")>=0;
	}
	/**
	 * @return true ��
	 */
	public static boolean isSunOS(){
		return OS.indexOf("sunos")>=0;
	}
	/**
	 * @return true ��
	 */
	public static boolean isMPEiX(){
		return OS.indexOf("mpe/ix")>=0;
	}
	/**
	 * @return true ��
	 */
	public static boolean isHPUX(){
		return OS.indexOf("hp-ux")>=0;
	}
	/**
	 * @return true ��
	 */
	public static boolean isAix(){
		return OS.indexOf("aix")>=0;
	}
	/**
	 * @return true ��
	 */
	public static boolean isOS390(){
		return OS.indexOf("os/390")>=0;
	}
	/**
	 * @return true ��
	 */
	public static boolean isFreeBSD(){
		return OS.indexOf("freebsd")>=0;
	}
	/**
	 * @return true ��
	 */
	public static boolean isIrix(){
		return OS.indexOf("irix")>=0;
	}
	/**
	 * @return true ��
	 */
	public static boolean isDigitalUnix(){
		return OS.indexOf("digital")>=0&&OS.indexOf("unix")>0;
	}
	/**
	 * @return true ��
	 */
	public static boolean isNetWare(){
		return OS.indexOf("netware")>=0;
	}
	/**
	 * @return true ��
	 */
	public static boolean isOSF1(){
		return OS.indexOf("osf1")>=0;
	}
	/**
	 * @return true ��
	 */
	public static boolean isOpenVMS(){
		return OS.indexOf("openvms")>=0;
	}
	
	/**
	 * @param args ����
	 */
	public static void main(String[] args) {
		System.out.println(System.getProperty("os.version").toLowerCase());
		
	}
}