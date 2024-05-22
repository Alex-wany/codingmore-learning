package top.codingmore.generator;

import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.rules.DateType;
import top.codingmore.CodingmoreAutogeneratorApplication;

/**
 * 微信搜索「沉默王二」，回复 Java
 *
 * @author 沉默王二
 * @date 5/17/22
 */
public class CodeGenerator {
    public static void main(String[] args) {


        // 1、创建代码生成器
        AutoGenerator mpg = new AutoGenerator();

        // 2、全局配置
        GlobalConfig gc = new GlobalConfig();
        String projectPath = System.getProperty("user.dir");
        // ！！！
        // 此处建议写项目/src/main/java源代码的绝对路径+模块名+"/src/main/java"
        // 这样生成的代码就会在对应的模块下
        // 比如此处生成的代码就会在codingmore-autogenerator模块下
        gc.setOutputDir(projectPath + "/codingmore-autogenerator/src/main/java");
        // 生成注释时的作者
        gc.setAuthor("小王");
        //生成后是否打开资源管理器
        gc.setOpen(false);
        gc.setFileOverride(true); //重新生成时文件是否覆盖
        gc.setServiceName("%sService");	//去掉Service接口的首字母I
        gc.setIdType(IdType.ID_WORKER_STR); //主键策略
        gc.setDateType(DateType.ONLY_DATE); //定义生成的实体类中日期类型
        // 如果开启Swagger,要引入相应的包
//        gc.setSwagger2(true); //开启Swagger2模式

        mpg.setGlobalConfig(gc);

        // 3、数据源配置
        DataSourceConfig dsc = new DataSourceConfig();
        dsc.setUrl("jdbc:mysql://localhost:3306/codingmore?useUnicode=true&useSSL=false&characterEncoding=utf8&serverTimezone=Asia/Shanghai");

        dsc.setDriverName("com.mysql.cj.jdbc.Driver");
        dsc.setUsername("root");
        dsc.setPassword("12345678");
        dsc.setDbType(DbType.MYSQL);
        mpg.setDataSource(dsc);

        // 4、包配置
        PackageConfig pc = new PackageConfig();
        // 此处要注意：parent + moduleName 为包的名字，在这个包下，创建对应的controller...
        pc.setParent("top.codingmore");
        pc.setModuleName("mpg"); //模块名
        pc.setController("controller");
        pc.setEntity("entity");
        pc.setService("service");
        pc.setMapper("mapper");
        mpg.setPackageInfo(pc);

//        PackageConfig pc = new PackageConfig();
//        pc.setModuleName(null);
//        pc.setParent("com.raier.civilization");
//        mpg.setPackageInfo(pc);

        /*// 5、策略配置
        StrategyConfig strategy = new StrategyConfig();
        // 数据库中表的名字，表示要对哪些表进行自动生成controller service、mapper...
        strategy.setInclude("edu_course","edu_course_description",
                "edu_chapter","edu_video");
        // 数据库表映射到实体的命名策略,驼峰命名法
        strategy.setNaming(NamingStrategy.underline_to_camel);
        // 生成实体时去掉表前缀，比如edu_course，如果不加下面这句，生成的实体类名字就是：EduCourse
        strategy.setTablePrefix("edu_");
        //生成实体时去掉表前缀
        // strategy.setTablePrefix(pc.getModuleName() + "_");

        //数据库表字段映射到实体的命名策略
        strategy.setColumnNaming(NamingStrategy.underline_to_camel);
        strategy.setEntityLombokModel(true); // lombok 模型 @Accessors(chain = true) setter链式操作

        strategy.setRestControllerStyle(true); //restful api风格控制器
        strategy.setControllerMappingHyphenStyle(true); //url中驼峰转连字符

        mpg.setStrategy(strategy);
*/
        // 6、执行
        mpg.execute();




        /*
        // 代码生成器
        AutoGenerator mpg = new AutoGenerator();

        // 全局配置
        GlobalConfig gc = new GlobalConfig();
        String projectPath = System.getProperty("user.dir");//获取当前项目路径
        System.out.println("projectPath = " + projectPath);
        //此处一定要加上子模块名，不然会生成到当前模块下
        gc.setOutputDir(projectPath + "/codingmore-autogenerator/src/main/java");
        System.out.println("gc.getOutputDir() = " + gc.getOutputDir());
        gc.setAuthor("沉默王二");
        gc.setOpen(false);
        gc.setDateType(DateType.ONLY_DATE);
        gc.setSwagger2(true);
        gc.setIdType(IdType.AUTO);
        gc.setBaseColumnList(true);
        gc.setBaseResultMap(true);
        gc.setFileOverride(true);

        mpg.setGlobalConfig(gc);

        // 数据源配置
        DataSourceConfig dsc = new DataSourceConfig();
        dsc.setUrl("jdbc:mysql://localhost:3306/codingmore?useUnicode=true&characterEncoding=utf-8&serverTimezone=Asia/Shanghai");
        dsc.setDriverName("com.mysql.cj.jdbc.Driver");
        dsc.setUsername("root");
        dsc.setPassword("12345678");

        mpg.setDataSource(dsc);

        // 包配置
        PackageConfig pc = new PackageConfig();
        pc.setParent("top.codingmore.mpg");
        mpg.setPackageInfo(pc);

        mpg.execute();*/
    }
}
