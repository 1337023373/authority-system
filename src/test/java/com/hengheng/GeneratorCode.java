package com.hengheng;

import com.baomidou.mybatisplus.generator.FastAutoGenerator;
import com.baomidou.mybatisplus.generator.config.OutputFile;
import com.baomidou.mybatisplus.generator.config.rules.DbColumnType;
import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;

import java.sql.Types;
import java.util.Collections;

public class GeneratorCode {
    private static String author ="hengheng";//作者名称
    private static String outputDir ="D:\\workspace\\idea_workspace\\sdy\\home\\authority-system\\src\\main\\java\\com\\hengheng";//生成的位置
    private static String driver ="com.mysql.cj.jdbc.Driver";//驱动，注意版本
    //连接路径,注意修改数据库名称
    private static String url ="jdbc:mysql://localhost:3306/db_authority_system?useUnicode=true&characterEncoding=UTF-8&serverTimezone=UTC";
    private static String username ="root";//数据库用户名
    private static String password ="123456";//数据库密码
    private static String tablePrefix ="sys_";//数据库表的前缀，如t_user
    private static String [] tables = {"sys_user","sys_role","sys_permission","sys_department"};   //生成的表
    private static String parentPackage = "demo";//顶级包结构
    private static String dao = "dao";//数据访问层包名称
    private static String service = "service";//业务逻辑层包名称
    private static String entity = "entity";//实体层包名称
    private static String controller = "controller";//控制器层包名称
    private static String mapperxml = "mapper";//mapper映射文件包名称
    public static void main(String[] args) {
        FastAutoGenerator.create("jdbc:mysql://localhost:3306/db_authority_system?useUnicode=true&characterEncoding=UTF-8&serverTimezone=UTC", "root", "123456")
                .globalConfig(builder -> {
                    builder.author(author) // 设置作者
                            .enableSwagger() // 开启 swagger 模式
                            .outputDir(outputDir); // 指定输出目录
                })
                .dataSourceConfig(builder ->
                        builder.typeConvertHandler((globalConfig, typeRegistry, metaInfo) -> {
                            int typeCode = metaInfo.getJdbcType().TYPE_CODE;
                            if (typeCode == Types.SMALLINT) {
                                // 自定义类型转换
                                return DbColumnType.INTEGER;
                            }
                            return typeRegistry.getColumnType(metaInfo);
                        })
                )
                .packageConfig(builder ->
                        builder.parent(parentPackage) // 设置父包名
                                .moduleName("demo") // 设置父包模块名
                                .pathInfo(Collections.singletonMap(OutputFile.xml, "D:\\workspace\\idea_workspace\\sdy\\home\\authority-system\\src\\main\\resource\\mapper")) // 设置mapperXml生成路径
                                .mapper(dao)
                                .service(service)
                                .entity(entity)
                                .controller(controller)
                                .serviceImpl(service + ".impl")
                                .xml(mapperxml)
                )
                .strategyConfig(builder ->
                        builder.addInclude("sys_user", "sys_role", "sys_permission", "sys_department") // 设置需要生成的表名
                                .addTablePrefix("sys_") // 设置过滤表前缀
                )
                .templateEngine(new FreemarkerTemplateEngine()) // 使用Freemarker引擎模板，默认的是Velocity引擎模板
                .execute();

    }
}