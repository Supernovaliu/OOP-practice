package com.flora.Practice3;
import com.flora.practice2.*;
import java.util.Arrays;
import java.util.Date;

/*使用package声明类或接口所属的包
 * 包，属于标识符，遵循标识符命名的规则
 * 每“.”一次，就代表一层文件目录
 * 同一个包下，不能命名相同的接口、类
 * 可以使用“xxx.*”的方式，表示可以导入XXX包下的所有结构
 * 如果在源文件中，使用了不同包下的同名的类，至少有一个类需要全类名的方式
 * import static导入指定类或接口中的静态结构：属性或方法
 * 类只能声明成public或缺省
 * 
 *  * */
public class PackageImportTest {
public static void main(String[] args) {
	String info = Arrays.toString(new int[] {1,2,3});
	Bank bank = new Bank();
	Date date = new Date();
}
}
