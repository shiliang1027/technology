@echo off
:: ***************************************
:: ***************************************
:: ********** Google JSѹ�� **********
:: ***************************************
:: ***************************************
:: ***************************************
E:
cd /workspace-linkage-new/website/WebRoot/website/css
set jarPath="E:\workspace-linkage-new\website\WebRoot\WEB-INF\lib\yuicompressor-2.4.7.jar"
for /f "delims=" %%i in ('dir /b /a-d /s "*.min.css"') do (
	del %%i
	echo ɾ��%%i
)
setlocal enabledelayedexpansion
for /f "delims=" %%i in ('dir /b /a-d /s "*.css"') do (
	echo. ׼��ѹ��%%i
	set minfile="%%i"
	set sfile="%%i"
	:: �������ѹ������ļ���
	set minfile=!minfile:.css=.min.css!
	:: �������Google compiler����ѹ����Ҳ�����Լ����������޸ĳ�����ѹ������
	java -jar %jarPath% --charset utf-8 -o !minfile! !sfile!  
	echo !minfile! 
)
echo.ѹ�����
pause
