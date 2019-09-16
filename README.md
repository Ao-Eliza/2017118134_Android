# 2017118134_Android   
  
  导入一个项目  
  
1、在build.gradle里添加google()，两处都要添加；   
	![Image text](https://raw.githubusercontent.com/Ao-Eliza/2017118134_Android/master/images/1.png)
	![Image text](https://raw.githubusercontent.com/Ao-Eliza/2017118134_Android/master/images/3.png)    
2、修改gradle.wrapper.properties里的Android Studio版本为当前版本；   
	![Image text](https://raw.githubusercontent.com/Ao-Eliza/2017118134_Android/master/images/2.png)   
3、导文件的时候应该直接选择项目，不要选择了文件夹；   
	![Image text](https://raw.githubusercontent.com/Ao-Eliza/2017118134_Android/master/images/4.png)    
	![Image text](https://raw.githubusercontent.com/Ao-Eliza/2017118134_Android/master/images/5.png)    
	![Image text](https://raw.githubusercontent.com/Ao-Eliza/2017118134_Android/master/images/6.png)  
4、导入的项目比较老，有一些不再支持的部分，可以自己创建一个新的项目然后修改，还需要下载插件；   
	![Image text](https://raw.githubusercontent.com/Ao-Eliza/2017118134_Android/master/images/7.png)
	![Image text](https://raw.githubusercontent.com/Ao-Eliza/2017118134_Android/master/images/8.png)   
	
	SourceTree推送到远端   
	  
1、推送的时候出现问题fatal: Could not read from remote repository. 参考以下博客解决，利用Git生成本机SSH Key并添加到GitHub中；   
本地仓库和github之间是通过SSH加密传输的，所以需要先到github中添加你本机的SSH Key 进行认证。    
	https://www.cnblogs.com/wmr95/p/7852832.html    
	https://blog.csdn.net/u014103733/article/details/79190004    
2、解决sourceTree的git clone 报SSH密钥认证失败的问题；   
	https://segmentfault.com/a/1190000016365283   
	![Image text](https://raw.githubusercontent.com/Ao-Eliza/2017118134_Android/master/images/9.png)    
	   
	readme.md文件插入图片
	https://www.cnblogs.com/hongmaju/p/6873720.html   
