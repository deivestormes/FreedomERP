EXEDIR=${0%/*}
cd $EXEDIR/..
java -classpath lib/freedomrep.jar:lib/jcommon.jar:lib/jfreechart.jar:lib/itext.jar:lib/jaybird-full.jar:lib/nachocalendar.jar:lib/commons-logging.jar:lib/jasperreports.jar:lib/liquidlnf.jar:lib/metouia.jar:lib/commons-beanutils.jar:lib/commons-collections.jar:lib/mail.jar:lib/barbecue.jar:lib/ireport.jar:lib/activation.jar:lib/brazilutils.jar:lib/bizcal.jar:lib/TableLayout.jar:lib/santec.jar:lib/jcalendar.jar:lib/swingx.jar:lib/swingx-ws.jar:lib/poi.jar:lib/dom4j.jar:lib/ical4j.jar:lib/log4j.jar -DARQINI=ini/represen.ini -DARQLOG=log/freedomrep.log org.freedom.modulos.rep.FreedomREP
