<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
<xsl:template match="/">
<html>
<head>
    <title>Mobile Phone Sales</title>
    <style>
        body { font-family: sans-serif; }
        table { width: 80%; margin: 20px auto; border-collapse: collapse; }
        th, td { border: 1px solid black; padding: 8px; text-align: left; }
        th { background-color: #007bff; color: white; }
        h1 { text-align: center; }
    </style>
</head>
<body>
    <h1>Mobile Phone Sales Summary</h1>
    <table>
        <tr>
            <th>ModelID</th>
            <th>Brand</th>
            <th>Price</th>
            <th>Color</th>
            <th>SIM Size</th>
            <th>Memory</th>
            <th>Camera</th>
            <th>Touch Screen</th>
            <th>Number Sold</th>
            <th>Store Name</th>
        </tr>
        <xsl:for-each select="salesReport/phone">
            <tr>
                <xsl:attribute name="style">
                    <xsl:if test="NoSold > 10">
                        color: red;
                    </xsl:if>
                </xsl:attribute>
                
                <td><xsl:value-of select="ModelID"/></td>
                <td><xsl:value-of select="Brand"/></td>
                <td><xsl:value-of select="Price"/></td>
                <td><xsl:value-of select="Color"/></td>
                <td><xsl:value-of select="SIMSize"/></td>
                <td><xsl:value-of select="Memory"/></td>
                <td><xsl:value-of select="Camera"/></td>
                <td><xsl:value-of select="TouchScreen"/></td>
                <td><xsl:value-of select="NoSold"/></td>
                <td><xsl:value-of select="storeName"/></td>
            </tr>
        </xsl:for-each>
    </table>
</body>
</html>
</xsl:template>
</xsl:stylesheet>