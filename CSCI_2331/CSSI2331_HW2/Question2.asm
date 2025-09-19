;Sum of two 32 bit integers
.386
.model flat, stdcall
.stack 4096
ExitProcess PROTO, dwExitCode:DWORD

INCLUDE Irvine32.inc
;Sum of two 32 bit integers

.data
wArray WORD 300,400,500
dArray SDWORD 50 DUP(?)
myTest BYTE 500 DUP("TEST")
bArray BYTE 20 DUP(0)
fabColor BYTE "GREEN",0