项目结构

```
├── ssm
│   ├── src                  
│   │   ├── main                
│   │   │   ├── java/com/ssm             
│   │   │   │   ├── annotation           // 自定义注解等
│   │   │   │   ├── controller           // 控制层
│   │   │   │   ├── dao                  // interface 层
│   │   │   │   ├── mapper               // mybatis的 xml 层
│   │   │   │   ├── model                // 实体类
│   │   │   │   ├── mq                   // activeMQ相关实现（ topic 和 queue ）
│   │   │   │   ├── redis                // redis相关
│   │   │   │   ├── service              // service接口层
│   │   │   │   │   ├── impl             // service接口的实现层
│   │   │   │   ├── shiro                // 采用shiro，实现用户的登录与权限控制等
│   │   │   │   ├── utils                // 工具类，包括常量类（运用枚举）、获取ip地址、xss转义、序列化类等
│   │   │   ├── resources                // 资源
│   │   │   ├── webapps                 
│   │   │   │   ├── WEB-INF             
│   │   │   │   │   ├── view             //存放jsp目录
│   │   │   │   │   ├── web.xml          
│   │   │   │   ├── static               // 静态资源
│   │   ├── test                         // junit单元测试
│   └── pom.xml                          //maven管理的 pom 文件
│   └── README.md
