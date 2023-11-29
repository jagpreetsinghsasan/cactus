/*
 * Copyright IBM Corp. All Rights Reserved.
 *
 * SPDX-License-Identifier: Apache-2.0
 */

package org.hyperledger.cacti.weaver.imodule.corda

import org.hyperledger.cacti.weaver.imodule.corda.flows.getCertificateFromString
import org.hyperledger.cacti.weaver.imodule.corda.flows.verifyCertificateChain
import org.hyperledger.cacti.weaver.imodule.corda.flows.verifyNodeSignature
import arrow.core.flatMap
import arrow.core.Right
import org.hyperledger.cacti.weaver.imodule.corda.flows.verifyCaCertificate
import org.junit.Test
import kotlin.test.assertTrue

class CertUtilsTests {
    @Test
    fun `verifyCaCertificate tests`() {
        val fabricCA = "-----BEGIN CERTIFICATE-----\n" +
                "MIICCTCCAbCgAwIBAgIIcFe0qctqSucwCgYIKoZIzj0EAwIwWDEbMBkGA1UEAwwS\n" +
                "Q29yZGEgTm9kZSBSb290IENBMQswCQYDVQQKDAJSMzEOMAwGA1UECwwFY29yZGEx\n" +
                "DzANBgNVBAcMBkxvbmRvbjELMAkGA1UEBhMCVUswHhcNMTcwNTIyMDAwMDAwWhcN\n" +
                "MjcwNTIwMDAwMDAwWjBYMRswGQYDVQQDDBJDb3JkYSBOb2RlIFJvb3QgQ0ExCzAJ\n" +
                "BgNVBAoMAlIzMQ4wDAYDVQQLDAVjb3JkYTEPMA0GA1UEBwwGTG9uZG9uMQswCQYD\n" +
                "VQQGEwJVSzBZMBMGByqGSM49AgEGCCqGSM49AwEHA0IABGlm6LFHrVkzfuUHin36\n" +
                "Jrm1aUMarX/NUZXw8n8gSiJmsZPlUEplJ+f/lzZMky5EZPTtCciG34pnOP0eiMd/\n" +
                "JTCjZDBiMB0GA1UdDgQWBBR8rqnfuUgBKxOJC5rmRYUcORcHczALBgNVHQ8EBAMC\n" +
                "AYYwIwYDVR0lBBwwGgYIKwYBBQUHAwEGCCsGAQUFBwMCBgRVHSUAMA8GA1UdEwEB\n" +
                "/wQFMAMBAf8wCgYIKoZIzj0EAwIDRwAwRAIgDaL4SguKsNeTT7SeUkFdoCBACeG8\n" +
                "GqO4M1KlfimphQwCICiq00hDanT5W8bTLqE7GIGuplf/O8AABlpWrUg6uiUB\n" +
                "-----END CERTIFICATE-----"
        val fabricCert = "-----BEGIN CERTIFICATE-----\n" +
                "MIICCTCCAbCgAwIBAgIIcFe0qctqSucwCgYIKoZIzj0EAwIwWDEbMBkGA1UEAwwS\n" +
                "Q29yZGEgTm9kZSBSb290IENBMQswCQYDVQQKDAJSMzEOMAwGA1UECwwFY29yZGEx\n" +
                "DzANBgNVBAcMBkxvbmRvbjELMAkGA1UEBhMCVUswHhcNMTcwNTIyMDAwMDAwWhcN\n" +
                "MjcwNTIwMDAwMDAwWjBYMRswGQYDVQQDDBJDb3JkYSBOb2RlIFJvb3QgQ0ExCzAJ\n" +
                "BgNVBAoMAlIzMQ4wDAYDVQQLDAVjb3JkYTEPMA0GA1UEBwwGTG9uZG9uMQswCQYD\n" +
                "VQQGEwJVSzBZMBMGByqGSM49AgEGCCqGSM49AwEHA0IABGlm6LFHrVkzfuUHin36\n" +
                "Jrm1aUMarX/NUZXw8n8gSiJmsZPlUEplJ+f/lzZMky5EZPTtCciG34pnOP0eiMd/\n" +
                "JTCjZDBiMB0GA1UdDgQWBBR8rqnfuUgBKxOJC5rmRYUcORcHczALBgNVHQ8EBAMC\n" +
                "AYYwIwYDVR0lBBwwGgYIKwYBBQUHAwEGCCsGAQUFBwMCBgRVHSUAMA8GA1UdEwEB\n" +
                "/wQFMAMBAf8wCgYIKoZIzj0EAwIDRwAwRAIgDaL4SguKsNeTT7SeUkFdoCBACeG8\n" +
                "GqO4M1KlfimphQwCICiq00hDanT5W8bTLqE7GIGuplf/O8AABlpWrUg6uiUB\n" +
                "-----END CERTIFICATE-----"

        getCertificateFromString(fabricCert).flatMap {
            val res = verifyCaCertificate(it, fabricCA)
            assertTrue { res.isRight() }
            Right(Unit)
        }
    }

    @Test
    fun `verifyCertificateChain tests`() {
        val certString = "-----BEGIN CERTIFICATE-----\nMIIBwjCCAV+gAwIBAgIIUJkQvmKm35YwFAYIKoZIzj0EAwIGCCqGSM49AwEHMC8x\nCzAJBgNVBAYTAkdCMQ8wDQYDVQQHDAZMb25kb24xDzANBgNVBAoMBlBhcnR5QTAe\nFw0yMDA3MjQwMDAwMDBaFw0yNzA1MjAwMDAwMDBaMC8xCzAJBgNVBAYTAkdCMQ8w\nDQYDVQQHDAZMb25kb24xDzANBgNVBAoMBlBhcnR5QTAqMAUGAytlcAMhAMMKaREK\nhcTgSBMMzK81oPUSPoVmG/fJMLXq/ujSmse9o4GJMIGGMB0GA1UdDgQWBBRMXtDs\nKFZzULdQ3c2DCUEx3T1CUDAPBgNVHRMBAf8EBTADAQH/MAsGA1UdDwQEAwIChDAT\nBgNVHSUEDDAKBggrBgEFBQcDAjAfBgNVHSMEGDAWgBR4hwLuLgfIZMEWzG4n3Axw\nfgPbezARBgorBgEEAYOKYgEBBAMCAQYwFAYIKoZIzj0EAwIGCCqGSM49AwEHA0cA\nMEQCIC7J46SxDDz3LjDNrEPjjwP2prgMEMh7r/gJpouQHBk+AiA+KzXD0d5miI86\nD2mYK4C3tRli3X3VgnCe8COqfYyuQg==\n-----END CERTIFICATE-----"
        val certChain = listOf(
                "-----BEGIN CERTIFICATE-----\nMIICCTCCAbCgAwIBAgIIcFe0qctqSucwCgYIKoZIzj0EAwIwWDEbMBkGA1UEAwwS\nQ29yZGEgTm9kZSBSb290IENBMQswCQYDVQQKDAJSMzEOMAwGA1UECwwFY29yZGEx\nDzANBgNVBAcMBkxvbmRvbjELMAkGA1UEBhMCVUswHhcNMTcwNTIyMDAwMDAwWhcN\nMjcwNTIwMDAwMDAwWjBYMRswGQYDVQQDDBJDb3JkYSBOb2RlIFJvb3QgQ0ExCzAJ\nBgNVBAoMAlIzMQ4wDAYDVQQLDAVjb3JkYTEPMA0GA1UEBwwGTG9uZG9uMQswCQYD\nVQQGEwJVSzBZMBMGByqGSM49AgEGCCqGSM49AwEHA0IABGlm6LFHrVkzfuUHin36\nJrm1aUMarX/NUZXw8n8gSiJmsZPlUEplJ+f/lzZMky5EZPTtCciG34pnOP0eiMd/\nJTCjZDBiMB0GA1UdDgQWBBR8rqnfuUgBKxOJC5rmRYUcORcHczALBgNVHQ8EBAMC\nAYYwIwYDVR0lBBwwGgYIKwYBBQUHAwEGCCsGAQUFBwMCBgRVHSUAMA8GA1UdEwEB\n/wQFMAMBAf8wCgYIKoZIzj0EAwIDRwAwRAIgDaL4SguKsNeTT7SeUkFdoCBACeG8\nGqO4M1KlfimphQwCICiq00hDanT5W8bTLqE7GIGuplf/O8AABlpWrUg6uiUB\n-----END CERTIFICATE-----",
                "-----BEGIN CERTIFICATE-----\nMIICXjCCAfugAwIBAgIIHVb6wd3RHhIwFAYIKoZIzj0EAwIGCCqGSM49AwEHMFgx\nGzAZBgNVBAMMEkNvcmRhIE5vZGUgUm9vdCBDQTELMAkGA1UECgwCUjMxDjAMBgNV\nBAsMBWNvcmRhMQ8wDQYDVQQHDAZMb25kb24xCzAJBgNVBAYTAlVLMB4XDTE4MDcx\nMDAwMDAwMFoXDTI3MDUyMDAwMDAwMFowYzELMAkGA1UEBhMCVVMxETAPBgNVBAcT\nCE5ldyBZb3JrMQ4wDAYDVQQLEwVDb3JkYTEWMBQGA1UEChMNUjMgSG9sZENvIExM\nQzEZMBcGA1UEAxMQQ29yZGEgRG9vcm1hbiBDQTBZMBMGByqGSM49AgEGCCqGSM49\nAwEHA0IABAPL3qAm4WZms5ciBVoxMQXfK7uTmHRVvWfWQ+QVYP3bMHSguHZRzB3v\n7EOE8RZpGDan+w007Xj7XR0+xG9SxmCjgZkwgZYwHQYDVR0OBBYEFOvuLjAVKUCu\nGZge2G/jfX8HosITMA8GA1UdEwEB/wQFMAMBAf8wCwYDVR0PBAQDAgGGMCMGA1Ud\nJQQcMBoGCCsGAQUFBwMBBggrBgEFBQcDAgYEVR0lADAfBgNVHSMEGDAWgBR8rqnf\nuUgBKxOJC5rmRYUcORcHczARBgorBgEEAYOKYgEBBAMCAQEwFAYIKoZIzj0EAwIG\nCCqGSM49AwEHA0cAMEQCIBmzQXpnCo9eAxkhwMt0bBr1Q0APJXF0KuBRsFBWAa6S\nAiBgx6G8G9Ij7B8+y65ItLKVcs7Kh6Rdnr5/1zB/yPwfrg==\n-----END CERTIFICATE-----",
                "-----BEGIN CERTIFICATE-----\nMIICbTCCAgmgAwIBAgIIYRljUiZaGSkwFAYIKoZIzj0EAwIGCCqGSM49AwEHMGMx\nCzAJBgNVBAYTAlVTMREwDwYDVQQHEwhOZXcgWW9yazEOMAwGA1UECxMFQ29yZGEx\nFjAUBgNVBAoTDVIzIEhvbGRDbyBMTEMxGTAXBgNVBAMTEENvcmRhIERvb3JtYW4g\nQ0EwHhcNMjAwNzI0MDAwMDAwWhcNMjcwNTIwMDAwMDAwWjAvMQswCQYDVQQGEwJH\nQjEPMA0GA1UEBwwGTG9uZG9uMQ8wDQYDVQQKDAZQYXJ0eUEwWTATBgcqhkjOPQIB\nBggqhkjOPQMBBwNCAASFze6k3tINqGLsKTi0a50RpOUCysno1/1lwIfEqaboauuj\no6Ecfu8X1WnW92VrEZGKslIJzR8R0deOEJvBs0rzo4HQMIHNMB0GA1UdDgQWBBR4\nhwLuLgfIZMEWzG4n3AxwfgPbezAPBgNVHRMBAf8EBTADAQH/MAsGA1UdDwQEAwIB\nhjATBgNVHSUEDDAKBggrBgEFBQcDAjAfBgNVHSMEGDAWgBTr7i4wFSlArhmYHthv\n431/B6LCEzARBgorBgEEAYOKYgEBBAMCAQQwRQYDVR0eAQH/BDswOaA1MDOkMTAv\nMQswCQYDVQQGEwJHQjEPMA0GA1UEBwwGTG9uZG9uMQ8wDQYDVQQKDAZQYXJ0eUGh\nADAUBggqhkjOPQQDAgYIKoZIzj0DAQcDSAAwRQIhANXBVAebUsY9AMfjZedNYN14\nWy76Ru5vMSta3Av1d08lAiAi2GZWk5XwJoEYuhQHXsHQLZbXphAVk+Q5tVgMgywj\ntQ==\n-----END CERTIFICATE-----"                
        )

        getCertificateFromString(certString).flatMap {
            val res = verifyCertificateChain(it, certChain)
            assertTrue { res.isRight() }
            Right(Unit)
        }
    }
}