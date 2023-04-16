@echo off
chcp 65001 >nul
:main
cls
color a
echo.
echo. ███╗   ███╗██╗   ██╗██╗  ████████╗██╗   ████████╗ ██████╗  ██████╗ ██╗     
echo. ████╗ ████║██║   ██║██║  ╚══██╔══╝██║   ╚══██╔══╝██╔═══██╗██╔═══██╗██║     
echo. ██╔████╔██║██║   ██║██║     ██║   ██║█████╗██║   ██║   ██║██║   ██║██║     
echo. ██║╚██╔╝██║██║   ██║██║     ██║   ██║╚════╝██║   ██║   ██║██║   ██║██║     
echo. ██║ ╚═╝ ██║╚██████╔╝███████╗██║   ██║      ██║   ╚██████╔╝╚██████╔╝███████╗
echo. ╚═╝     ╚═╝ ╚═════╝ ╚══════╝╚═╝   ╚═╝      ╚═╝    ╚═════╝  ╚═════╝ ╚══════╝
echo.
echo.
echo [1] - Google        [2] - Python          [3] - Text Ascii Art
echo.
set /p main=Option: 
if %main% == 1 goto o1
echo.
if %main% == 2 goto o2
echo.
if %main% == 3 goto o3
:o1
start https://www.google.com
goto main
:o2
start https://python.org
goto main
:o3
start http://patorjk.com/software/taag/#p=display&f=ANSI%20Shadow&t=youtube
goto main