.386
.model flat,stdcall
.stack 4096
ExitProcess PROTO, dwExitCode:DWORD

INCLUDE Irvine32.inc
.data
array DWORD 1,2,3,4

.code
main PROC
    mov  esi, 8
    mov  eax, array[esi]

	call writeInt
	exit
main ENDP
END main

