#!/bin/sh

hex2mime() {
    # Thanks pals! https://superuser.com/a/416630
    # https://linux.die.net/man/1/xxd
    # vim hexdum implementation (xxd)
    # https://github.com/vim/vim/blob/master/src/xxd/xxd.c
    # https://linux.die.net/man/1/base64
    # gnu base64 implementation
    # https://github.com/coreutils/gnulib/blob/master/lib/base64.c
   
    base_64=`echo $1 | xxd -r -p | base64`
    echo $base_64
    return 0
}

hex2mime $1
