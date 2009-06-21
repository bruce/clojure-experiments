#!/bin/sh

mkdir -p target/dependency
for dir in vendor/*
  do
    name=`echo $dir | sed 's/vendor\///'`
    pushd $dir
    ant
    popd
    unzip $dir/$name.jar -d target/dependency
  done  