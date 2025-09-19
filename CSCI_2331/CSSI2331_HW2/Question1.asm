;Sum of two 32 bit integers
.386
.model flat, stdcall
.stack 4096
ExitProcess PROTO, dwExitCode:DWORD

INCLUDE Irvine32.inc
;Sum of two 32 bit integers

.data
byte BYTE		30		; (0) : (2^8-1) 
sByte SBYTE		-20		; -(2^7) : (2^7-1) 
word WORD		600		; (0) : (2^16-1) 
sWord SWORD		-600	; -(2^15) : (2^15-1) 
dWord DWORD		4,000	; (0) : (2^32-1)  
sDWord SDWORD	-4,000	; -(2^31) : (2^31-1)  
qWord QWORD		10,000	; (0) : (2^64-1) 
tByte TBYTE		-10,000	; -(2^63) : (2^63-1)  
