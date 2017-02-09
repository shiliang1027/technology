@echo off
:: ***************************************
:: ***************************************
:: ********** Google JS压缩 **********
:: ***************************************
:: ***************************************
:: ***************************************
E:
cd /workspace-linkage-new/website/WebRoot/website/css
set jarPath="E:\workspace-linkage-new\website\WebRoot\WEB-INF\lib\yuicompressor-2.4.7.jar"
for /f "delims=" %%i in ('dir /b /a-d /s "*.min.css"') do (
	del %%i
	echo 删除%%i
)
setlocal enabledelayedexpansion
for /f "delims=" %%i in ('dir /b /a-d /s "*.css"') do (
	echo. 准备压缩%%i
	set minfile="%%i"
	set sfile="%%i"
	:: 这里调整压缩后的文件名
	set minfile=!minfile:.css=.min.css!
	:: 这里调用Google compiler进行压缩，也可以自己根据需求修改成其他压缩工具
	java -jar %jarPath% --charset utf-8 -o !minfile! !sfile!  
	echo !minfile! 
)
echo.压缩完成
pause
