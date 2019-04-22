{\rtf1\ansi\ansicpg1252\cocoartf1671\cocoasubrtf200
{\fonttbl\f0\fnil\fcharset0 Menlo-Regular;\f1\fnil\fcharset0 Menlo-BoldItalic;}
{\colortbl;\red255\green255\blue255;\red204\green108\blue29;\red217\green232\blue247;\red230\green230\blue250;
\red18\green144\blue195;\red249\green250\blue244;\red30\green181\blue64;\red121\green171\blue255;\red242\green242\blue0;
\red167\green236\blue33;\red141\green218\blue248;\red23\green198\blue163;\red243\green236\blue121;\red104\green151\blue187;
}
{\*\expandedcolortbl;;\csgenericrgb\c80000\c42353\c11373;\csgenericrgb\c85098\c90980\c96863;\csgenericrgb\c90196\c90196\c98039;
\csgenericrgb\c7059\c56471\c76471;\csgenericrgb\c97647\c98039\c95686;\csgenericrgb\c11765\c70980\c25098;\csgenericrgb\c47451\c67059\c100000;\csgenericrgb\c94902\c94902\c0;
\csgenericrgb\c65490\c92549\c12941;\csgenericrgb\c55294\c85490\c97255;\csgenericrgb\c9020\c77647\c63922;\csgenericrgb\c95294\c92549\c47451;\csgenericrgb\c40784\c59216\c73333;
}
\paperw11900\paperh16840\margl1440\margr1440\vieww33400\viewh17980\viewkind0
\deftab720
\pard\pardeftab720\partightenfactor0

\f0\fs24 \cf2 import\cf3  java\cf4 .\cf3 util\cf4 .\cf3 Scanner\cf4 ;\cf0 \
\
\cf2 public\cf3  \cf2 class\cf3  \cf5 ayy\cf3  \cf6 \{\cf0 \
\
\pard\pardeftab720\partightenfactor0
\cf3 	\cf2 public\cf3  \cf2 static\cf3  \cf2 void\cf3  \cf7 main\cf6 (\cf5 String\cf6 []\cf3  \cf8 args\cf6 )\cf3  \cf6 \{\cf0 \
\cf3 		\cf5 Scanner\cf3  \cf9 scan\cf4 =\cf3  \cf2 new\cf3  \cf10 Scanner\cf6 (\cf5 System\cf4 .
\f1\i\b \cf11 in
\f0\i0\b0 \cf6 )\cf4 ;\cf0 \
\cf3 		\cf5 System\cf4 .
\f1\i\b \cf11 out
\f0\i0\b0 \cf4 .\cf10 println\cf6 (\cf12 "How big do you want the Caesar shift cipher to be?"\cf6 )\cf4 ;\cf0 \
\cf3 		\cf2 double\cf3  \cf9 CIPHER\cf4 =\cf3   \cf13 scan\cf4 .\cf10 nextInt\cf6 ()\cf4 ;\cf0 \
\cf3 		\cf5 System\cf4 .
\f1\i\b \cf11 out
\f0\i0\b0 \cf4 .\cf10 print\cf6 (\cf12 "Now type whatever you want to encrypted and let the computer do the magic."\cf0 \
\cf3 				\cf4 +\cf3  \cf12 "\\n"\cf3  \cf4 +\cf3  \cf12 "Make sure it's lowercaps only:"\cf6 )\cf4 ;\cf0 \
\cf3 		\cf13 scan\cf4 .\cf10 nextLine\cf6 ()\cf4 ;\cf0 \
\cf3 		\cf5 String\cf3  \cf9 sentence\cf4 =\cf3  \cf13 scan\cf4 .\cf10 nextLine\cf6 ()\cf4 ;\cf0 \
\cf3 		\cf2 char\cf3  \cf9 sentenceChar\cf6 []\cf4 =\cf3  \cf13 sentence\cf4 .\cf10 toCharArray\cf6 ()\cf4 ;\cf0 \
\cf3 		\cf2 for\cf6 (\cf2 int\cf3  \cf9 i\cf4 =\cf14 0\cf4 ;\cf13 i\cf4 <\cf13 sentence\cf4 .\cf10 length\cf6 ()\cf4 ;\cf13 i\cf4 ++\cf6 )\{\cf0 \
\cf3 			\cf13 sentenceChar\cf6 [\cf13 i\cf6 ]\cf3  \cf4 +=\cf3  \cf13 CIPHER\cf4 ;\cf0 \
\cf3 			\cf2 if\cf3  \cf6 (\cf13 sentenceChar\cf6 [\cf13 i\cf6 ]\cf4 >=\cf14 97\cf4 +\cf3  \cf13 CIPHER\cf3  \cf4 &&\cf3  \cf13 sentenceChar\cf6 [\cf13 i\cf6 ]\cf4 <=\cf3  \cf14 122\cf4 +\cf3  \cf13 CIPHER\cf6 )\{\cf3 	\cf0 \
\cf3 				\cf2 if\cf3  \cf6 (\cf13 sentenceChar\cf6 [\cf13 i\cf6 ]\cf4 >\cf3  \cf14 122\cf6 )\{\cf0 \
\cf3 					\cf13 sentenceChar\cf6 [\cf13 i\cf6 ]\cf4 =\cf6 (\cf2 char\cf6 )(\cf13 sentenceChar\cf6 [\cf13 i\cf6 ]\cf4 -\cf14 26\cf6 )\cf4 ;\cf0 \
\cf3 				\cf6 \}\cf0 \
\cf3 				\cf5 System\cf4 .
\f1\i\b \cf11 out
\f0\i0\b0 \cf4 .\cf10 print\cf6 ((\cf2 char\cf6 )\cf13 sentenceChar\cf6 [\cf13 i\cf6 ])\cf4 ;\cf0 \
\cf3 			\cf6 \}\cf0 \
\cf3 			\cf2 else\cf6 \{\cf0 \
\cf3 			\cf5 System\cf4 .
\f1\i\b \cf11 out
\f0\i0\b0 \cf4 .\cf10 print\cf6 ((\cf2 char\cf6 )(\cf13 sentenceChar\cf6 [\cf13 i\cf6 ]\cf4 -\cf13 CIPHER\cf6 ))\cf4 ;\cf0 \
\cf3 			\cf6 \}\cf0 \
\cf3 		\cf6 \}\cf0 \
\cf3 		\cf13 scan\cf4 .\cf10 close\cf6 ()\cf4 ;\cf0 \
\cf3 	\cf6 \}\cf0 \
\
\pard\pardeftab720\partightenfactor0
\cf6 \}\cf0 \
}