# Easy mode

I just thought it's be nice to make an actually useful command line utility for just quickly converting hex to base64

## Bash

```sh
cd hex2mime_ez
chmod 0744 hex2mime.sh
./hex2mime.sh 45766964696e74

>RXZpZGludA==
```

## Powershell

```ps
cd hex2mime_ez
./hex2mime.ps1 45766964696e74

>RXZpZGludA==
```
If you are running a powershell window that is not in admin mode and has scripting disabled, but your user has admin privileges, you can bypass the execution policy temporatily like this:
```ps
powershell.exe -noprofile -executionpolicy bypass -file .\hex2mime.ps1 45766964696e74
```
