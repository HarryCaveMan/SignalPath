#!/bin/sh

hex2mime() {
    # Thanks pals! https://superuser.com/a/416630
    # https://linux.die.net/man/1/base64
    base_64=`echo $1 | xxd -r -p | base64`
    echo $base_64
    return 0
}

hex2mime $1