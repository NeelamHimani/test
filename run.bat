set projectLocation=C:\project\15-07-2020\KSPH_Automation_Script\
cd %projectLocation%
set classpath=%projectLocation%\target\test-classes;%projectLocation%\lib\*;
java org.testng.TestNG %projectLocation%\testng.xml
pause