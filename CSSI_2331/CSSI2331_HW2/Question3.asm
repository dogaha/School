.386
.model flat,stdcall
.stack 4096
ExitProcess PROTO, dwExitCode:DWORD

INCLUDE Irvine32.inc
mon = 2
wed = 4
fri = 3
sat = 5

.data
totalTime DWORD ?

.code
main PROC
	mov eax, 0			
	add eax, mon*60
	add eax, wed*60
	add eax, fri*60
	add eax, sat*60
	mov totalTime, eax

	call writeInt
	exit
main ENDP
END main

