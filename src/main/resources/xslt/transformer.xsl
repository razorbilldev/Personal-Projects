<?xml version='1.0'?>
<xsl:stylesheet version="3.0" xmlns:fileutils="java:com.wolterskluwer.ovid.journals.xslt.extensions.common.FileHandlingUtils" xmlns:xsl="http://www.w3.org/1999/XSL/Transform" xmlns:map="http://www.w3.org/2005/xpath-functions/map" xmlns:xlink="http://www.w3.org/1999/xlink" xmlns:xs="http://www.w3.org/2001/XMLSchema" xmlns:saxon="http://saxon.sf.net/" xmlns:mml="http://www.w3.org/1998/Math/MathML" xmlns:ovid="http://www.ovid.com/xmlimport/" xmlns:oasis="-//OASIS//DTD XML Exchange Table Model 19990315//EN" exclude-result-prefixes="xlink fileutils xs saxon mml ovid oasis map">
    <xsl:output method="xml" omit-xml-declaration="yes" indent="yes"/>
    <xsl:param name="dtdVersion" select="'2009.2F'"/>
    <xsl:param name="serialCode" as="xs:string"/>
    <xsl:param name="issueDate" as="xs:string"/>
    <xsl:param name="inputDir" as="xs:string"/>
    <xsl:param name="rptFile" as="xs:string"/>
    <xsl:param name="tier" as="xs:integer"/>
    <xsl:strip-space elements="*"/>
    <xsl:template match="p/fig">
        <LV1>
            <FG>
                <xsl:if test="@id">
                    <xsl:attribute name="ID" select="@id"/>
                </xsl:if>
                <xsl:if test="graphic/@xlink:href">
                    <xsl:attribute name="FILE">
                        <xsl:value-of select="concat('file:///C:/Users/MUKHAM~1/AppData/Local/Temp/_test5jZqOon8/input/', graphic/@xlink:href, '.jpg')"/>
                    </xsl:attribute>
                </xsl:if>
                <xsl:choose>
                    <xsl:when test="caption">
                        <xsl:apply-templates select="caption"/>
                    </xsl:when>
                    <xsl:otherwise>
                        <P>Figure. No caption available.</P>
                    </xsl:otherwise>
                </xsl:choose>
            </FG>
        </LV1>
    </xsl:template>
</xsl:stylesheet>